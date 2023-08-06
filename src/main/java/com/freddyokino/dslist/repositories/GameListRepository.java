package com.freddyokino.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freddyokino.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
