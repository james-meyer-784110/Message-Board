package app.controllers;

import app.models.Board;
import app.repos.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MessageBoardController {

    @Autowired
    private BoardRepo boardRepo;

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/b/{board}")
    public String getBoard(@PathVariable String boardTitle){

        Board result = null;
        for(Board board : boardRepo.findAll()){
            if(board.getTitle().equals(boardTitle)){
                result = board;
                break;
            }
        }

        if(result != null){
            return "board";
        }else{
            return "404";
        }
    }
}