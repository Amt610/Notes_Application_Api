package com.amit.Notes.service;

import com.amit.Notes.dto.NoteDto;
import com.amit.Notes.entity.Note;
import com.amit.Notes.exception.ResourceNotFoundException;
import com.amit.Notes.mapper.NotesMapper;
import com.amit.Notes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteService {
    private final NoteRepository repository;

    public NoteService(NoteRepository repository){
        this.repository=repository;
    }

    // Create
    public NoteDto createDto(NoteDto noteDto){
        Note note= NotesMapper.toEntity(noteDto);
        return NotesMapper.ToDTO(repository.save(note));
    }

    //Show all
    public List<NoteDto> getAllNotes(){
        return repository.findAll().stream()
                .map(NotesMapper::ToDTO)
                .collect(Collectors.toList());
    }


    //getBy Id
    public NoteDto getNoteById(Long id){
        Note note=repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Not found Exception"));
        return NotesMapper.ToDTO(note);
    }


    //updateNote
    public NoteDto updateNote(Long id,NoteDto noteDto){
        Note note=repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Not found Exception"+id));

        note.setTitle(noteDto.getTitle());
        note.setContent(noteDto.getContent());
        return NotesMapper.ToDTO(repository.save(note));
    }

    //delete by id
    public void deleteById(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Note found with id "+id);
        }
        repository.deleteById(id);
    }

}
