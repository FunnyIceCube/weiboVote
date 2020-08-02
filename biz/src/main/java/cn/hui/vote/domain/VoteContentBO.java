package cn.hui.vote.domain;

import lombok.Data;

import java.util.Date;

/**
 * VoteContentDO 
 *
 * @author Auto generated by luzhaohui
 * @since 2020-03-16
 * @version 1.0
 */
@Data
public class VoteContentBO {

    private static final long serialVersionUID = -1L;
    private Long    id;
    private Date    gmtCreate;
    private Date    gmtModify;

    /**
    * form_id
    */
    private Long formId;

    /**
    * line_num
    */
    private Integer lineNum;

    /**
    * line_text
    */
    private String lineText;

    /**
    * line_pic
    */
    private String linePic;

}