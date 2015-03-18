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

public class btJointFeedback extends BulletBase {
	private long swigCPtr;
	
	protected btJointFeedback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btJointFeedback, normally you should not need this constructor it's intended for low-level usage. */ 
	public btJointFeedback(long cPtr, boolean cMemoryOwn) {
		this("btJointFeedback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btJointFeedback obj) {
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
				DynamicsJNI.delete_btJointFeedback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setAppliedForceBodyA(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedForceBodyA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedForceBodyA() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedForceBodyA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAppliedTorqueBodyA(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedTorqueBodyA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedTorqueBodyA() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedTorqueBodyA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAppliedForceBodyB(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedForceBodyB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedForceBodyB() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedForceBodyB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAppliedTorqueBodyB(btVector3 value) {
    DynamicsJNI.btJointFeedback_appliedTorqueBodyB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAppliedTorqueBodyB() {
    long cPtr = DynamicsJNI.btJointFeedback_appliedTorqueBodyB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btJointFeedback() {
    this(DynamicsJNI.new_btJointFeedback(), true);
  }

}
