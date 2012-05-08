package com.mogoweb.test.opengltest;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class HelloOpenGLES20SurfaceView extends GLSurfaceView {
	
	public HelloOpenGLES20SurfaceView(Context context) {
		super(context);
		
		// Create an OpenGL ES 2.0 context.
		setEGLContextClientVersion(2);
		// Set the Renderer for drawing on the GLSurfaceView
		setRenderer(new HelloOpenGLES20Renderer());
	}
}
