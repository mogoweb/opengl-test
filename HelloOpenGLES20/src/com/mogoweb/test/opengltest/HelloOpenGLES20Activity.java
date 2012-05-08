package com.mogoweb.test.opengltest;

import android.R;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class HelloOpenGLES20Activity extends Activity {
	private GLSurfaceView mGLView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity
        mGLView = new HelloOpenGLES20SurfaceView(this);
        setContentView(mGLView);
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	
    	// The following call pauses the rendering thread.
    	// If your OpenGL application is memory intensive,
    	// you should consider de-allocating objects that
    	// consume significant memory here.
    	mGLView.onPause();
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	
    	// The following call resumes a paused rendering thread.
    	// If you de-allocated graphics objects for onPause()
    	// this is a good place to re-allocate them.
    	mGLView.onResume();
    }
}