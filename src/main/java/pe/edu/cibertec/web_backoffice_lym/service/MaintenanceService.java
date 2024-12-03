package pe.edu.cibertec.web_backoffice_lym.service;

import pe.edu.cibertec.web_backoffice_lym.dto.FilmDetailDto;
import pe.edu.cibertec.web_backoffice_lym.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findFilmById(int id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);
}
