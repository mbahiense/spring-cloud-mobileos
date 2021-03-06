package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.CheckListItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListItemRepository extends CrudRepository<CheckListItemEntity, Long> {
}
