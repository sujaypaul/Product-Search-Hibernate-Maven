package com.nagarro.training.AdvanceJavaAssignment2.controller;

public class Track implements Runnable  {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ModificationWatcher.modificationTrack();
	}
}