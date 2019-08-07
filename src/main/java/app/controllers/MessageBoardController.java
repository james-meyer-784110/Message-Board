package app.controllers;

import app.models.Board;
import app.repos.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MessageBoardController {

    private void debug(String msg){
        System.out.println("[DEBIG]: " + msg);
    }

    @Autowired
    private BoardRepo boardRepo;

    @GetMapping("/")
    public String getIndex(Model model){
        debug("Serving index");
        model.addAttribute("boards", boardRepo.findAll());
        return "index";
    }

    @GetMapping("/b/{boardTitle}")
    public String getBoard(@PathVariable String boardTitle, Model model){
        Board result = null;
        for(Board board : boardRepo.findAll()){
            if(board.getTitle().equals(boardTitle)){
                result = board;
                break;
            }
        }

        if(result != null){
            debug("Serving " + boardTitle + " board");
            model.addAttribute("board", result);
            return "board";
        }else{
            debug("Serving 404");
            return "404";
        }
    }
}