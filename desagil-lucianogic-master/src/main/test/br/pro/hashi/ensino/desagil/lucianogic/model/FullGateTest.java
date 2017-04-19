package br.pro.hashi.ensino.desagil.lucianogic.model;

import org.junit.Assert;
import org.junit.Test;

public class FullGateTest {
	@Test
	public void ifReceivesFalseFalseFalseShouldEmitFalseFalse() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(false), 0);
		fullGate.connect(new MockEmitter(false), 1);
		fullGate.connect(new MockEmitter(false), 2);

		Assert.assertEquals(false, fullGate.read(0));
		Assert.assertEquals(false, fullGate.read(1));
	}

	@Test
	public void ifReceivesFalseFalseTrueShouldEmitTrueFalse() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(false), 0);
		fullGate.connect(new MockEmitter(false), 1);
		fullGate.connect(new MockEmitter(true), 2);

		Assert.assertEquals(true, fullGate.read(0));
		Assert.assertEquals(false, fullGate.read(1));
	}

	@Test
	public void ifReceivesFalseTrueFalseShouldEmitTrueFalse() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(false), 0);
		fullGate.connect(new MockEmitter(true), 1);
		fullGate.connect(new MockEmitter(false), 2);

		Assert.assertEquals(true, fullGate.read(0));
		Assert.assertEquals(false, fullGate.read(1));
	}

	@Test
	public void ifReceivesFalseTrueTrueShouldEmitFalseTrue() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(false), 0);
		fullGate.connect(new MockEmitter(true), 1);
		fullGate.connect(new MockEmitter(true), 2);

		Assert.assertEquals(false, fullGate.read(0));
		Assert.assertEquals(true, fullGate.read(1));
	}

	@Test
	public void ifReceivesTrueFalseFalseShouldEmitTrueFalse() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(true), 0);
		fullGate.connect(new MockEmitter(false), 1);
		fullGate.connect(new MockEmitter(false), 2);

		Assert.assertEquals(true, fullGate.read(0));
		Assert.assertEquals(false, fullGate.read(1));
	}

	@Test
	public void ifReceivesTrueFalseTrueShouldEmitFalseTrue() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(true), 0);
		fullGate.connect(new MockEmitter(false), 1);
		fullGate.connect(new MockEmitter(true), 2);

		Assert.assertEquals(false, fullGate.read(0));
		Assert.assertEquals(true, fullGate.read(1));
	}

	@Test
	public void ifReceivesTrueTrueFalseShouldEmitFalseTrue() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(true), 0);
		fullGate.connect(new MockEmitter(true), 1);
		fullGate.connect(new MockEmitter(false), 2);

		Assert.assertEquals(false, fullGate.read(0));
		Assert.assertEquals(true, fullGate.read(1));
	}

	@Test
	public void ifReceivesTrueTrueTrueShouldEmitTrueTrue() {
		FullGate fullGate = new FullGate();

		fullGate.connect(new MockEmitter(true), 0);
		fullGate.connect(new MockEmitter(true), 1);
		fullGate.connect(new MockEmitter(true), 2);

		Assert.assertEquals(true, fullGate.read(0));
		Assert.assertEquals(true, fullGate.read(1));
	}
}
