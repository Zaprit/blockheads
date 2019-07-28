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
public class ENetProtocolDisconnect extends Structure {
	/** C type : ENetProtocolCommandHeader */
	public ENetProtocolCommandHeader header;
	/** C type : enet_uint32 */
	public int data;
	public ENetProtocolDisconnect() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("header", "data");
	}
	/**
	 * @param header C type : ENetProtocolCommandHeader<br>
	 * @param data C type : enet_uint32
	 */
	public ENetProtocolDisconnect(ENetProtocolCommandHeader header, int data) {
		super();
		this.header = header;
		this.data = data;
	}
	public ENetProtocolDisconnect(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ENetProtocolDisconnect implements Structure.ByReference {
		
	}

	public static class ByValue extends ENetProtocolDisconnect implements Structure.ByValue {
		
	}
}
