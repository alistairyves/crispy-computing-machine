package com.alistairyves.crispycomputingmachine.controller;

import static org.junit.Assert.*;

import javafx.geometry.Pos;
import org.junit.Test;

public class PodcastControllerTest {

  @Test
  public void ControllerReturnsExpectedString() {
    PodcastController pc = new PodcastController();
    assertEquals("Hello Podcast Mapping",pc.test());
  }
}