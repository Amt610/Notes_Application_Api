package com.amit.Notes.mapper;

import com.amit.Notes.dto.NoteDto;
import com.amit.Notes.entity.Note;

public class NotesMapper {
     public static NoteDto ToDTO(Note note){
        NoteDto dto=new NoteDto();
        dto.setId(note.getId());
        dto.setTitle(note.getTitle());
        dto.setContent(note.getContent());
        dto.setCreatedAt(note.getCreatedAt());
        return dto;
     }


     public static Note toEntity(NoteDto noteDto){
         Note entity=new Note();
         entity.setId(noteDto.getId());
         entity.setTitle(noteDto.getTitle());
         entity.setContent(noteDto.getContent());
         entity.setCreatedAt(noteDto.getCreatedAt());
         return entity;
     }
}
