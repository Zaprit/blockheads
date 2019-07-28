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
public class ENetProtocolVerifyConnect extends Structure {
	/** C type : ENetProtocolCommandHeader */
	public ENetProtocolCommandHeader header;
	/** C type : enet_uint16 */
	public short outgoingPeerID;
	/** C type : enet_uint8 */
	public byte incomingSessionID;
	/** C type : enet_uint8 */
	public byte outgoingSessionID;
	/** C type : enet_uint32 */
	public int mtu;
	/** C type : enet_uint32 */
	public int windowSize;
	/** C type : enet_uint32 */
	public int channelCount;
	/** C type : enet_uint32 */
	public int incomingBandwidth;
	/** C type : enet_uint32 */
	public int outgoingBandwidth;
	/** C type : enet_uint32 */
	public int packetThrottleInterval;
	/** C type : enet_uint32 */
	public int packetThrottleAcceleration;
	/** C type : enet_uint32 */
	public int packetThrottleDeceleration;
	/** C type : enet_uint32 */
	public int connectID;
	public ENetProtocolVerifyConnect() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("header", "outgoingPeerID", "incomingSessionID", "outgoingSessionID", "mtu", "windowSize", "channelCount", "incomingBandwidth", "outgoingBandwidth", "packetThrottleInterval", "packetThrottleAcceleration", "packetThrottleDeceleration", "connectID");
	}
	public ENetProtocolVerifyConnect(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ENetProtocolVerifyConnect implements Structure.ByReference {
		
	}

	public static class ByValue extends ENetProtocolVerifyConnect implements Structure.ByValue {
		
	}
}
