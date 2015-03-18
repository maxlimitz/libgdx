/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBroadphaseInterface extends BulletBase {
	private long swigCPtr;
	
	protected btBroadphaseInterface(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBroadphaseInterface, normally you should not need this constructor it's intended for low-level usage. */ 
	public btBroadphaseInterface(long cPtr, boolean cMemoryOwn) {
		this("btBroadphaseInterface", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btBroadphaseInterface obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btBroadphaseInterface(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btBroadphaseProxy createProxy(Vector3 aabbMin, Vector3 aabbMax, int shapeType, long userPtr, short collisionFilterGroup, short collisionFilterMask, btDispatcher dispatcher, long multiSapProxy) {
	return btBroadphaseProxy.internalTemp(CollisionJNI.btBroadphaseInterface_createProxy(swigCPtr, this, aabbMin, aabbMax, shapeType, userPtr, collisionFilterGroup, collisionFilterMask, btDispatcher.getCPtr(dispatcher), dispatcher, multiSapProxy), false);
}

  public void destroyProxy(btBroadphaseProxy proxy, btDispatcher dispatcher) {
    CollisionJNI.btBroadphaseInterface_destroyProxy(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void setAabb(btBroadphaseProxy proxy, Vector3 aabbMin, Vector3 aabbMax, btDispatcher dispatcher) {
    CollisionJNI.btBroadphaseInterface_setAabb(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, aabbMin, aabbMax, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void getAabb(btBroadphaseProxy proxy, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btBroadphaseInterface_getAabb(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, aabbMin, aabbMax);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btBroadphaseInterface_rayTest__SWIG_0(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin, aabbMax);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin) {
    CollisionJNI.btBroadphaseInterface_rayTest__SWIG_1(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback) {
    CollisionJNI.btBroadphaseInterface_rayTest__SWIG_2(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback);
  }

  public void aabbTest(Vector3 aabbMin, Vector3 aabbMax, btBroadphaseAabbCallback callback) {
    CollisionJNI.btBroadphaseInterface_aabbTest(swigCPtr, this, aabbMin, aabbMax, btBroadphaseAabbCallback.getCPtr(callback), callback);
  }

  public void calculateOverlappingPairs(btDispatcher dispatcher) {
    CollisionJNI.btBroadphaseInterface_calculateOverlappingPairs(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public btOverlappingPairCache getOverlappingPairCache() {
    long cPtr = CollisionJNI.btBroadphaseInterface_getOverlappingPairCache__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCache(cPtr, false);
  }

  public void getBroadphaseAabb(Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btBroadphaseInterface_getBroadphaseAabb(swigCPtr, this, aabbMin, aabbMax);
  }

  public void resetPool(btDispatcher dispatcher) {
    CollisionJNI.btBroadphaseInterface_resetPool(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void printStats() {
    CollisionJNI.btBroadphaseInterface_printStats(swigCPtr, this);
  }

}
