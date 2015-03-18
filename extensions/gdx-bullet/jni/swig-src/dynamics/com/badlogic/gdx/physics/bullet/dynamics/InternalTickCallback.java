/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class InternalTickCallback extends BulletBase {
	private long swigCPtr;
	
	protected InternalTickCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new InternalTickCallback, normally you should not need this constructor it's intended for low-level usage. */ 
	public InternalTickCallback(long cPtr, boolean cMemoryOwn) {
		this("InternalTickCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(InternalTickCallback obj) {
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
				DynamicsJNI.delete_InternalTickCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    DynamicsJNI.InternalTickCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    DynamicsJNI.InternalTickCallback_change_ownership(this, swigCPtr, true);
  }

  public InternalTickCallback(btDynamicsWorld dynamicsWorld, boolean isPreTick) {
    this(DynamicsJNI.new_InternalTickCallback__SWIG_0(btDynamicsWorld.getCPtr(dynamicsWorld), dynamicsWorld, isPreTick), true);
    DynamicsJNI.InternalTickCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public InternalTickCallback(btDynamicsWorld dynamicsWorld) {
    this(DynamicsJNI.new_InternalTickCallback__SWIG_1(btDynamicsWorld.getCPtr(dynamicsWorld), dynamicsWorld), true);
    DynamicsJNI.InternalTickCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public InternalTickCallback() {
    this(DynamicsJNI.new_InternalTickCallback__SWIG_2(), true);
    DynamicsJNI.InternalTickCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void onInternalTick(btDynamicsWorld dynamicsWorld, float timeStep) {
    if (getClass() == InternalTickCallback.class) DynamicsJNI.InternalTickCallback_onInternalTick(swigCPtr, this, btDynamicsWorld.getCPtr(dynamicsWorld), dynamicsWorld, timeStep); else DynamicsJNI.InternalTickCallback_onInternalTickSwigExplicitInternalTickCallback(swigCPtr, this, btDynamicsWorld.getCPtr(dynamicsWorld), dynamicsWorld, timeStep);
  }

  public void detach() {
    DynamicsJNI.InternalTickCallback_detach__SWIG_0(swigCPtr, this);
  }

  public void attach(btDynamicsWorld dynamicsWorld, boolean isPreTick) {
    DynamicsJNI.InternalTickCallback_attach__SWIG_0(swigCPtr, this, btDynamicsWorld.getCPtr(dynamicsWorld), dynamicsWorld, isPreTick);
  }

  public void attach() {
    DynamicsJNI.InternalTickCallback_attach__SWIG_1(swigCPtr, this);
  }

  public static void detach(btDynamicsWorld dynamicsWorld, boolean isPreTick) {
    DynamicsJNI.InternalTickCallback_detach__SWIG_1(btDynamicsWorld.getCPtr(dynamicsWorld), dynamicsWorld, isPreTick);
  }

}
