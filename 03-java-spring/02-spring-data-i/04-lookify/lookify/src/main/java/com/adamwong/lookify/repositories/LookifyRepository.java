package com.adamwong.lookify.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adamwong.lookify.models.Lookify;

@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
	List<Lookify> findAll();
    List<Lookify> findByArtistContaining(String artist);
    List<Lookify> findTopTenByOrderByRatingDesc();
}