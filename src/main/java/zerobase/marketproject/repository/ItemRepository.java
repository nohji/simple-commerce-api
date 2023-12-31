package zerobase.marketproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.marketproject.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    Item findItemById(int id);

}
