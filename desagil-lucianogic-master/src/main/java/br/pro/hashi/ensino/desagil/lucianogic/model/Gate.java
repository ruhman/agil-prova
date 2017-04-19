package br.pro.hashi.ensino.desagil.lucianogic.model;

public abstract class Gate implements Receiver, Emitter {
	private int inSize, outSize;
	protected String name;

	protected Gate(int inSize, int outSize) {
		this.inSize = inSize;
		this.outSize = outSize;
	}

	@Override
	public boolean read() {
		return read(0);
	}

	public boolean read(int index) {
		if(index < 0 || index >= outSize) {
			throw new IndexOutOfBoundsException();
		}
		return doRead(index);
	}

	protected abstract boolean doRead(int index);

	@Override
	public void connect(Emitter emitter, int index) {
		if(index < 0 || index >= inSize) {
			throw new IndexOutOfBoundsException();
		}
		doConnect(emitter, index);
	}

	protected abstract void doConnect(Emitter emitter, int index);

	public String toString() {
		return name;
	}

	public int getInSize() {
		return inSize;
	}
	public int getOutSize() {
		return outSize;
	}
}
