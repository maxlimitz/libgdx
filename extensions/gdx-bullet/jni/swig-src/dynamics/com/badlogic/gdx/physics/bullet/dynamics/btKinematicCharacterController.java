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

public class btKinematicCharacterController extends btCharacterControllerInterface {
	private long swigCPtr;
	
	protected btKinematicCharacterController(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btKinematicCharacterController_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btKinematicCharacterController, normally you should not need this constructor it's intended for low-level usage. */
	public btKinematicCharacterController(long cPtr, boolean cMemoryOwn) {
		this("btKinematicCharacterController", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btKinematicCharacterController_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btKinematicCharacterController obj) {
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
				DynamicsJNI.delete_btKinematicCharacterController(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btKinematicCharacterController(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight, int upAxis) {
    this(DynamicsJNI.new_btKinematicCharacterController__SWIG_0(btPairCachingGhostObject.getCPtr(ghostObject), ghostObject, btConvexShape.getCPtr(convexShape), convexShape, stepHeight, upAxis), true);
  }

  public btKinematicCharacterController(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight) {
    this(DynamicsJNI.new_btKinematicCharacterController__SWIG_1(btPairCachingGhostObject.getCPtr(ghostObject), ghostObject, btConvexShape.getCPtr(convexShape), convexShape, stepHeight), true);
  }

  public void setUpAxis(int axis) {
    DynamicsJNI.btKinematicCharacterController_setUpAxis(swigCPtr, this, axis);
  }

  public void setFallSpeed(float fallSpeed) {
    DynamicsJNI.btKinematicCharacterController_setFallSpeed(swigCPtr, this, fallSpeed);
  }

  public void setJumpSpeed(float jumpSpeed) {
    DynamicsJNI.btKinematicCharacterController_setJumpSpeed(swigCPtr, this, jumpSpeed);
  }

  public void setMaxJumpHeight(float maxJumpHeight) {
    DynamicsJNI.btKinematicCharacterController_setMaxJumpHeight(swigCPtr, this, maxJumpHeight);
  }

  public void setGravity(float gravity) {
    DynamicsJNI.btKinematicCharacterController_setGravity(swigCPtr, this, gravity);
  }

  public float getGravity() {
    return DynamicsJNI.btKinematicCharacterController_getGravity(swigCPtr, this);
  }

  public void setMaxSlope(float slopeRadians) {
    DynamicsJNI.btKinematicCharacterController_setMaxSlope(swigCPtr, this, slopeRadians);
  }

  public float getMaxSlope() {
    return DynamicsJNI.btKinematicCharacterController_getMaxSlope(swigCPtr, this);
  }

  public btPairCachingGhostObject getGhostObject() {
    long cPtr = DynamicsJNI.btKinematicCharacterController_getGhostObject(swigCPtr, this);
    return (cPtr == 0) ? null : new btPairCachingGhostObject(cPtr, false);
  }

  public void setUseGhostSweepTest(boolean useGhostObjectSweepTest) {
    DynamicsJNI.btKinematicCharacterController_setUseGhostSweepTest(swigCPtr, this, useGhostObjectSweepTest);
  }

}
