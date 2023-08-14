package org.koreait.controllers.board;

import lombok.Data;

@Data
public class BoardDataForm {
    private String id;
    private String title;
    private String subject;
    private String content;

}
