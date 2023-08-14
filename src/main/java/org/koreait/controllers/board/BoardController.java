package org.koreait.controllers.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/write")
    public String Write() {
        System.out.println("쓰기");
        return "board/write";
    }
}
