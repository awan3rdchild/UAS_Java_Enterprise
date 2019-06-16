package com.exa.api.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column
import javax.persistence.ManyToOne
import javax.persistence.JoinColumn

@Entity
@Table(name = "books")
class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id

    @NotNull
    @Column(nullable = false)
    String judul_buku

    @NotNull
    @Column(nullable = false)
    String pengarang

    @NotNull
    @Column(nullable = false)
    String penerbit

    @NotNull
    @Column(nullable = false)
    String tahun
    
    @ManyToOne
    @JoinColumn(name = "categories_id", referencedColumnName = "id", nullable = true)
    Category category
}