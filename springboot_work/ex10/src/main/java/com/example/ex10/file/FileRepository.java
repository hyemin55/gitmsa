package com.example.ex10.file;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.File;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}