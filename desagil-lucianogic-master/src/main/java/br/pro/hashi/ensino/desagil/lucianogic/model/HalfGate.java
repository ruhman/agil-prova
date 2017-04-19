package br.pro.hashi.ensino.desagil.lucianogic.model;

public class HalfGate extends Gate {
	private XorGate xor;
	private AndGate and;


	public HalfGate() {
		super(2, 2);

		name = "HALF";

		xor = new XorGate();

		and = new AndGate();
	}

	@Override
	public boolean doRead(int index) {
		switch(index) {
		case 0:
			return xor.read();
		case 1:
			return and.read();
		}
		return false;
	}

	@Override
	protected void doConnect(Emitter emitter, int index) {
		switch(index) {
		case 0:
			xor.connect(emitter, 0);
			and.connect(emitter, 0);
			break;
		case 1:
			xor.connect(emitter, 1);
			and.connect(emitter, 1);
			break;
		}
	}
}
