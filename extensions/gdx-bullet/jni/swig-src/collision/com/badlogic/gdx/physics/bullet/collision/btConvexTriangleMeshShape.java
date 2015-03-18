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

public class btConvexTriangleMeshShape extends btPolyhedralConvexAabbCachingShape {
	private long swigCPtr;
	
	protected btConvexTriangleMeshShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexTriangleMeshShape, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
		this("btConvexTriangleMeshShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexTriangleMeshShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexTriangleMeshShape obj) {
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
				CollisionJNI.delete_btConvexTriangleMeshShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConvexTriangleMeshShape(btStridingMeshInterface meshInterface, boolean calcAabb) {
    this(CollisionJNI.new_btConvexTriangleMeshShape__SWIG_0(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, calcAabb), true);
  }

  public btConvexTriangleMeshShape(btStridingMeshInterface meshInterface) {
    this(CollisionJNI.new_btConvexTriangleMeshShape__SWIG_1(btStridingMeshInterface.getCPtr(meshInterface), meshInterface), true);
  }

  public btStridingMeshInterface getMeshInterface() {
    long cPtr = CollisionJNI.btConvexTriangleMeshShape_getMeshInterface__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btStridingMeshInterface(cPtr, false);
  }

  public void calculatePrincipalAxisTransform(Matrix4 principal, Vector3 inertia, SWIGTYPE_p_float volume) {
    CollisionJNI.btConvexTriangleMeshShape_calculatePrincipalAxisTransform(swigCPtr, this, principal, inertia, SWIGTYPE_p_float.getCPtr(volume));
  }

}
