package br.pro.hashi.ensino.desagil.lucianogic.model;

public class FullGate extends Gate {
	private XorGate xor;
	private XorGate xor1;
	private AndGate and;
	private AndGate and1;
	private OrGate or;


	public FullGate() {
		super(3, 2);

		name = "FULL";

		xor = new XorGate();
		xor1 = new XorGate();
		and = new AndGate();
		and1 = new AndGate();
		or = new OrGate();
		xor1.connect(xor,0);
		and.connect(xor,0);
		or.connect(and,0);
		or.connect(and1,1);
		
	}

	@Override
	public boolean doRead(int index) {
		switch(index) {
		case 0:
			return xor1.read();
		case 1:
			return or.read();
		}
		return false;
	}

	@Override
	protected void doConnect(Emitter emitter, int index) {
		switch(index) {
		case 0:
			xor.connect(emitter, 0);
			and1.connect(emitter, 0);
			break;
		case 1:
			xor.connect(emitter, 1);
			and1.connect(emitter, 1);
			break;
		case 2:
			xor1.connect(emitter, 1);
			and.connect(emitter, 1);
			break;
		}
	}
}
