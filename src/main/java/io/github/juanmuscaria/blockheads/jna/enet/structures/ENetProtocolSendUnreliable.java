package io.github.juanmuscaria.blockheads.jna.enet.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : ./enet/protocol.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ENetProtocolSendUnreliable extends Structure {
	/** C type : ENetProtocolCommandHeader */
	public ENetProtocolCommandHeader header;
	/** C type : enet_uint16 */
	public short unreliableSequenceNumber;
	/** C type : enet_uint16 */
	public short dataLength;
	public ENetProtocolSendUnreliable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("header", "unreliableSequenceNumber", "dataLength");
	}
	/**
	 * @param header C type : ENetProtocolCommandHeader<br>
	 * @param unreliableSequenceNumber C type : enet_uint16<br>
	 * @param dataLength C type : enet_uint16
	 */
	public ENetProtocolSendUnreliable(ENetProtocolCommandHeader header, short unreliableSequenceNumber, short dataLength) {
		super();
		this.header = header;
		this.unreliableSequenceNumber = unreliableSequenceNumber;
		this.dataLength = dataLength;
	}
	public ENetProtocolSendUnreliable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ENetProtocolSendUnreliable implements Structure.ByReference {
		
	}

	public static class ByValue extends ENetProtocolSendUnreliable implements Structure.ByValue {
		
	}
}
