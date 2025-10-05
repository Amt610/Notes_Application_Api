package com.amit.Notes.controller;

import com.amit.Notes.dto.NoteDto;
import com.amit.Notes.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/notes")
@CrossOrigin(origins = "*")
public class NoteController {
    private final NoteService noteService;

    public NoteController(NoteService noteService){
        this.noteService=noteService;
    }

    //Post Mapping
    @PostMapping
    public List<NoteDto> getAll(){
        return noteService.getAllNotes();
    }


    //Get Mapping
    @GetMapping("/{id}")
    public NoteDto getById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }

    //Put Mapping
    @PutMapping("/{id}")
    public NoteDto update(@PathVariable Long id,@RequestBody NoteDto noteDto){
        return noteService.updateNote(id,noteDto);
    }


    //Delete Mapping
    public String delete(@PathVariable Long id){
        noteService.deleteById(id);
        return "Note Successfully deleted";
    }
}
