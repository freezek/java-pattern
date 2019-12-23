package com.ikaimen.javase.exception;

import java.io.IOException;

/**
 * @ClassName DemoException
 * @Description TODO
 * @Author chentao
 * @Date 2019/9/21 11:14 上午
 * @ModifyDate 2019/9/21 11:14 上午
 * @Version 1.0
 */
public class DemoException extends RuntimeException {


//    sc_irs_en_normal.irs_user_lo_status_$->{0..15},sc_irs_math_normal.irs_user_lo_status_$->{0..15},sc_irs_cn_normal.irs_user_lo_status_$->{0..15},sc_irs_phy_normal.irs_user_lo_status_$->{0..15},sc_irs_chemistry_normal.irs_user_lo_status_$->{0..15},sc_irs_biology_normal.irs_user_lo_status_$->{0..15}
//
//    sc_irs_en_normal.irs_user_lo_status_last_$->{0..15},sc_irs_math_normal.irs_user_lo_status_last_$->{0..15},sc_irs_cn_normal.irs_user_lo_status_last_$->{0..15},sc_irs_phy_normal.irs_user_lo_status_last_$->{0..15},sc_irs_chemistry_normal.irs_user_lo_status_last_$->{0..15},sc_irs_biology_normal.irs_user_lo_status_last_$->{0..15}
//
//    sc_irs_en_normal.sc_efficiency_record_$->{0..15},sc_irs_math_normal.sc_efficiency_record_$->{0..15},sc_irs_cn_normal.sc_efficiency_record_$->{0..15},sc_irs_phy_normal.sc_efficiency_record_$->{0..15},sc_irs_chemistry_normal.sc_efficiency_record_$->{0..15},sc_irs_biology_normal.sc_efficiency_record_$->{0..15}
//
//    sc_irs_en_normal.sc_efficiency_$->{0..15},sc_irs_math_normal.sc_efficiency_$->{0..15},sc_irs_cn_normal.sc_efficiency_$->{0..15},sc_irs_phy_normal.sc_efficiency_$->{0..15},sc_irs_chemistry_normal.sc_efficiency_$->{0..15},sc_irs_biology_normal.sc_efficiency_$->{0..15}
//
//    sc_irs_en_normal.irs_ability_$->{0..15},sc_irs_math_normal.irs_ability_$->{0..15},sc_irs_cn_normal.irs_ability_$->{0..15},sc_irs_phy_normal.irs_ability_$->{0..15},sc_irs_chemistry_normal.irs_ability_$->{0..15},sc_irs_biology_normal.irs_ability_$->{0..15}
//
//    sc_irs_en_normal.irs_ability_mastery_$->{0..15},sc_irs_math_normal.irs_ability_mastery_$->{0..15},sc_irs_cn_normal.irs_ability_mastery_$->{0..15},sc_irs_phy_normal.irs_ability_mastery_$->{0..15},sc_irs_chemistry_normal.irs_ability_mastery_$->{0..15},sc_irs_biology_normal.irs_ability_mastery_$->{0..15}
//
//    sc_irs_en_normal.irs_ability_mastery_record_$->{0..15},sc_irs_math_normal.irs_ability_mastery_record_$->{0..15},sc_irs_cn_normal.irs_ability_mastery_record_$->{0..15},sc_irs_phy_normal.irs_ability_mastery_record_$->{0..15},sc_irs_chemistry_normal.irs_ability_mastery_record_$->{0..15},sc_irs_biology_normal.irs_ability_mastery_record_$->{0..15}
//
//    sc_irs_en_normal.irs_forget_curve_$->{0..15},sc_irs_math_normal.irs_forget_curve_$->{0..15},sc_irs_cn_normal.irs_forget_curve_$->{0..15},sc_irs_phy_normal.irs_forget_curve_$->{0..15},sc_irs_chemistry_normal.irs_forget_curve_$->{0..15},sc_irs_biology_normal.irs_forget_curve_$->{0..15}
//
//    sc_irs_en_normal.irs_master_status_$->{0..15},sc_irs_math_normal.irs_master_status_$->{0..15},sc_irs_cn_normal.irs_master_status_$->{0..15},sc_irs_phy_normal.irs_master_status_$->{0..15},sc_irs_chemistry_normal.irs_master_status_$->{0..15},sc_irs_biology_normal.irs_master_status_$->{0..15}
//
//    sc_irs_en_normal.irs_result_record_$->{0..15},sc_irs_math_normal.irs_result_record_$->{0..15},sc_irs_cn_normal.irs_result_record_$->{0..15},sc_irs_phy_normal.irs_result_record_$->{0..15},sc_irs_chemistry_normal.irs_result_record_$->{0..15},sc_irs_biology_normal.irs_result_record_$->{0..15}
//
//    sc_irs_en_normal.irs_session_$->{0..15},sc_irs_math_normal.irs_session_$->{0..15},sc_irs_cn_normal.irs_session_$->{0..15},sc_irs_phy_normal.irs_session_$->{0..15},sc_irs_chemistry_normal.irs_session_$->{0..15},sc_irs_biology_normal.irs_session_$->{0..15}
//
//    sc_irs_en.irs_result_record_$->{0..15},sc_irs_math.irs_result_record_$->{0..15},sc_irs_cn.irs_result_record_$->{0..15},sc_irs_phy.irs_result_record_$->{0..15},sc_irs_chemistry.irs_result_record_$->{0..15},sc_irs_biology.irs_result_record_$->{0..15}

    public DemoException(String message) {
        super(message);
    }

    public DemoException(String message, Throwable cause) {
        super(message, cause);
    }

}
