/*
 * Encode.java
 * Copyright (c) 2013 kinjo
 * All rights reserved.
 * ---------------------------------------------------------------------
 * 2013-8-17 Created
 */
package com.fbee.modules.redis.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.fbee.modules.redis.exception.RedisExcepiton;

/**
 * Note that this is the one element of this package that is most likely to
 * change drastically. It is provided, for now, as a helper for using
 * {@link JRedis}.
 * <p>
 * 重新编码转化为byte数组
 * </p>
 * 
 * @author kinjoYang
 * @version 1.0 2013-08-17
 * @since 1.0
 * 
 */
public class Encode {

	public final static Charset SUPPORTED_CHARSET = Charset.forName("UTF-8");

	/**
	 * This helper method is mainly intended for use with a list of keys
	 * returned from Redis, given that it will use the UTF-8 {@link Charset} in
	 * decoding the byte array. Typical use would be to convert from the
	 * List<byte[]> output of {@link JRedis#keys()}
	 * 
	 * @param bytearray
	 * @return
	 */
	public static final List<String> toStr(List<byte[]> bytearray) {
		List<String> list = new ArrayList<String>(bytearray.size());
		for (byte[] b : bytearray)
			list.add(toStr(b));
		return list;
	}

	/**
	 * @param bytes
	 * @return
	 */
	public static final String toStr(byte[] bytes) {
		return new String(bytes, SUPPORTED_CHARSET);
	}

	/**
	 * @param bytes
	 * @return
	 */
	public static final Integer toInt(byte[] bytes) {
		return new Integer(toStr(bytes));
	}

	/**
	 * This helper method will convert the byte[] to a {@link Long}.
	 * 
	 * @param bytes
	 * @return
	 */
	public static final Long toLong(byte[] bytes) {
		return new Long(toStr(bytes));
	}

	/**
	 * This helper method will assume that the byte[] provided are the
	 * serialized bytes obtainable for an instance of type T obtained from
	 * {@link ObjectOutputStream} and subsequently stored as a value for a Redis
	 * key (regardless of key type).
	 * <p>
	 * Specifically, this method will simply do:
	 * 
	 * <pre>
	 * <code>
	 * ObjectInputStream oin = new ObjectInputStream(new ByteArrayInputStream(bytes));
	 * t = (T) oin.readObject();
	 * </code>
	 * </pre>
	 * 
	 * and returning the reference <i>t</i>, and throwing any exceptions
	 * encountered along the way.
	 * <p>
	 * This method is the decoding peer of {@link Encode#encode(Serializable)},
	 * and it is assumed (and certainly recommended) that you use these two
	 * methods in tandem.
	 * <p>
	 * Naturally, all caveats, rules, and considerations that generally apply to
	 * {@link Serializable} and the Object Serialization specification apply.
	 * 
	 * @param <T>
	 * @param bytes
	 * @return the instance for <code><b>T</b></code>
	 */
	@SuppressWarnings("unchecked")
	public static final <T extends Serializable> T decode(byte[] bytes) throws RedisExcepiton {
		T t = null;
		try {
			ObjectInputStream oin = new ObjectInputStream(new ByteArrayInputStream(bytes));
			t = (T) oin.readObject();
		} catch (IOException e) {
			throw new RedisExcepiton("Error decoding byte[] data to instantiate java object,IOException", e);
		} catch (ClassNotFoundException e) {
			throw new RedisExcepiton("Error decoding byte[] data to instantiate java object,ClassNotFoundException", e);
		} catch (ClassCastException e) {
			throw new RedisExcepiton("Error decoding byte[] data to instantiate java object,ClassCastException", e);
		}
		return t;
	}

	/**
	 * This helper method will serialize the given serializable object of type T
	 * to a byte[], suitable for use as a value for a redis key, regardless of
	 * the key type.
	 * 
	 * @param <T>
	 * @param obj
	 * @return
	 */
	public static final <T extends Serializable> byte[] encode(T obj) throws RedisExcepiton {
		byte[] bytes = null;
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(obj);
			bytes = bout.toByteArray();
		} catch (IOException e) {
			throw new RedisExcepiton("Error serializing object" + obj + ":", e);
		}
		// this for development phase only -- will be removed. (A bit of
		// performance hit.)
		// finally {
		// // test it!
		// try {
		// T decoded = decode(bytes); // we want this compile warning to
		// remember to remove this in future.
		// }
		// catch (Exception e) {
		// e.printStackTrace();
		// System.err.format("error in verifying the decoding of the encoded object %s",
		// obj.getClass().getName());
		// }
		// }
		return bytes;
	}
}
