package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.board.BoardDataForm;
import org.koreait.model.board.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("게시글 저장 서비스 테스트")
public class BoardSaveServiceTest {

    @Autowired
    private SaveService saveService;

    @Test
    @DisplayName("게시글 작성, 수정 성공시 예외 발생 X")
    void saveSuccessTest() {
        BoardDataForm bd = new BoardDataForm();
        assertDoesNotThrow(() -> {
           saveService.save(bd);
        });
    }
}
