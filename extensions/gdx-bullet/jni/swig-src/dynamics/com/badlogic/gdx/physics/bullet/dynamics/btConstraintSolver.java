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

public class btConstraintSolver extends BulletBase {
	private long swigCPtr;
	
	protected btConstraintSolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConstraintSolver, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConstraintSolver(long cPtr, boolean cMemoryOwn) {
		this("btConstraintSolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConstraintSolver obj) {
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
				DynamicsJNI.delete_btConstraintSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void prepareSolve(int arg0, int arg1) {
    DynamicsJNI.btConstraintSolver_prepareSolve(swigCPtr, this, arg0, arg1);
  }

  public float solveGroup(SWIGTYPE_p_p_btCollisionObject bodies, int numBodies, SWIGTYPE_p_p_btPersistentManifold manifold, int numManifolds, SWIGTYPE_p_p_btTypedConstraint constraints, int numConstraints, btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher) {
    return DynamicsJNI.btConstraintSolver_solveGroup(swigCPtr, this, SWIGTYPE_p_p_btCollisionObject.getCPtr(bodies), numBodies, SWIGTYPE_p_p_btPersistentManifold.getCPtr(manifold), numManifolds, SWIGTYPE_p_p_btTypedConstraint.getCPtr(constraints), numConstraints, btContactSolverInfo.getCPtr(info), info, btIDebugDraw.getCPtr(debugDrawer), debugDrawer, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void allSolved(btContactSolverInfo arg0, btIDebugDraw arg1) {
    DynamicsJNI.btConstraintSolver_allSolved(swigCPtr, this, btContactSolverInfo.getCPtr(arg0), arg0, btIDebugDraw.getCPtr(arg1), arg1);
  }

  public void reset() {
    DynamicsJNI.btConstraintSolver_reset(swigCPtr, this);
  }

  public int getSolverType() {
    return DynamicsJNI.btConstraintSolver_getSolverType(swigCPtr, this);
  }

}
