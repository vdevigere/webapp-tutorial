package com.viddu.codegaga.controllers;

import java.util.EnumSet;

import com.viddu.codegaga.REGION;

public abstract class ComponentContoller {

    public abstract EnumSet<REGION> getAvailableRegions();

    public abstract String getControllerDefinition();

}
