package br.pro.hashi.ensino.desagil.lucianogic.model;

import org.junit.Assert;
import org.junit.Test;

public class HalfGateTest {
	@Test
	public void ifReceivesFalseFalseShouldEmitFalseFalse() {
		HalfGate halfGate = new HalfGate();

		halfGate.connect(new MockEmitter(false), 0);
		halfGate.connect(new MockEmitter(false), 1);

		Assert.assertEquals(false, halfGate.read(0));
		Assert.assertEquals(false, halfGate.read(1));
	}

	@Test
	public void ifReceivesFalseTrueShouldEmitTrueFalse() {
		HalfGate halfGate = new HalfGate();

		halfGate.connect(new MockEmitter(false), 0);
		halfGate.connect(new MockEmitter(true), 1);

		Assert.assertEquals(true, halfGate.read(0));
		Assert.assertEquals(false, halfGate.read(1));
	}

	@Test
	public void ifReceivesTrueFalseShouldEmitTrueFalse() {
		HalfGate halfGate = new HalfGate();

		halfGate.connect(new MockEmitter(true), 0);
		halfGate.connect(new MockEmitter(false), 1);

		Assert.assertEquals(true, halfGate.read(0));
		Assert.assertEquals(false, halfGate.read(1));
	}

	@Test
	public void ifReceivesTrueTrueShouldEmitFalseTrue() {
		HalfGate halfGate = new HalfGate();

		halfGate.connect(new MockEmitter(true), 0);
		halfGate.connect(new MockEmitter(true), 1);

		Assert.assertEquals(false, halfGate.read(0));
		Assert.assertEquals(true, halfGate.read(1));
	}
}
