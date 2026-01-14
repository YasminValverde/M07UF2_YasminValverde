package cat.institutmarianao.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cat.institutmarianao.domain.Medicine;

public interface MedicineRepository {
	Set<Medicine> getAllMedicines();

	Set<Medicine> getMedicamentsByFilter(Map<String, List<String>> filterParams);
}