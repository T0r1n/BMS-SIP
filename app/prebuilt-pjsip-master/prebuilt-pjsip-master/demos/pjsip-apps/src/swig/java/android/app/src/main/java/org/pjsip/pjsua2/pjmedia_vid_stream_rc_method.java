/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_vid_stream_rc_method {
  public final static pjmedia_vid_stream_rc_method PJMEDIA_VID_STREAM_RC_NONE = new pjmedia_vid_stream_rc_method("PJMEDIA_VID_STREAM_RC_NONE", pjsua2JNI.PJMEDIA_VID_STREAM_RC_NONE_get());
  public final static pjmedia_vid_stream_rc_method PJMEDIA_VID_STREAM_RC_SIMPLE_BLOCKING = new pjmedia_vid_stream_rc_method("PJMEDIA_VID_STREAM_RC_SIMPLE_BLOCKING", pjsua2JNI.PJMEDIA_VID_STREAM_RC_SIMPLE_BLOCKING_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_vid_stream_rc_method swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_vid_stream_rc_method.class + " with value " + swigValue);
  }

  private pjmedia_vid_stream_rc_method(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_vid_stream_rc_method(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_vid_stream_rc_method(String swigName, pjmedia_vid_stream_rc_method swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_vid_stream_rc_method[] swigValues = { PJMEDIA_VID_STREAM_RC_NONE, PJMEDIA_VID_STREAM_RC_SIMPLE_BLOCKING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

