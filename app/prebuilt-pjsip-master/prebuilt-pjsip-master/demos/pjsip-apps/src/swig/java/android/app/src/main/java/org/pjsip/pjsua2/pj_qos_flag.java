/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pj_qos_flag {
  public final static pj_qos_flag PJ_QOS_PARAM_HAS_DSCP = new pj_qos_flag("PJ_QOS_PARAM_HAS_DSCP", pjsua2JNI.PJ_QOS_PARAM_HAS_DSCP_get());
  public final static pj_qos_flag PJ_QOS_PARAM_HAS_SO_PRIO = new pj_qos_flag("PJ_QOS_PARAM_HAS_SO_PRIO", pjsua2JNI.PJ_QOS_PARAM_HAS_SO_PRIO_get());
  public final static pj_qos_flag PJ_QOS_PARAM_HAS_WMM = new pj_qos_flag("PJ_QOS_PARAM_HAS_WMM", pjsua2JNI.PJ_QOS_PARAM_HAS_WMM_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pj_qos_flag swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pj_qos_flag.class + " with value " + swigValue);
  }

  private pj_qos_flag(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pj_qos_flag(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pj_qos_flag(String swigName, pj_qos_flag swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pj_qos_flag[] swigValues = { PJ_QOS_PARAM_HAS_DSCP, PJ_QOS_PARAM_HAS_SO_PRIO, PJ_QOS_PARAM_HAS_WMM };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

