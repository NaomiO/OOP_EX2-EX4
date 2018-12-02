package GIS;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class GISproject implements GIS_project{
	
	private MetaDataGroup Meta_data;
	Set<GIS_layer> layer;
	
	public GISproject() {
		layer = new LinkedHashSet<GIS_layer>();
		Meta_data = new MetaDataGroup();
	}
	
	Set<GIS_layer> project= new HashSet<GIS_layer>();
/**
 * add layer to project
 */
	@Override
	public boolean add(GIS_layer e) {
		return project.add(e);
	}
/**
 * add all to project
 */
	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		return project.addAll(c);
	}
/**
 * clear project
 */
	@Override
	public void clear() {
		project.clear();
	}
/**
 * ask if contains o in the project
 */
	@Override
	public boolean contains(Object o) {
		return project.contains(o);
	}
/**
 * ask if the collection contains c
 */
	@Override
	public boolean containsAll(Collection<?> c) {
		return project.containsAll(c);
	}
/**
 * ask if project is empty
 */
	@Override
	public boolean isEmpty() {
		return project.isEmpty();
	}
/**
 * bring the iterator to project
 */
	@Override
	public Iterator<GIS_layer> iterator() {
		return project.iterator();
	}
/**
 * remove o from project
 */
	@Override
	public boolean remove(Object o) {
		return project.remove(o);
	}
/**
 * remove all c from project
 */
	@Override
	public boolean removeAll(Collection<?> c) {
		return project.removeAll(c);
	}
/**
 * retain all c in project
 */
	@Override
	public boolean retainAll(Collection<?> c) {
		return project.retainAll(c);
	}
/**
 * return size of project
 */
	@Override
	public int size() {
		return project.size();
	}
/**
 * take the _project to array
 */
	@Override
	public Object[] toArray() {
		return project.toArray();
	}
/**
 * create array from _project
 */
	@Override
	public <T> T[] toArray(T[] a) {
		return project.toArray(a);
	}
/**
 * return the metadata of project
 */
	@Override
	public Meta_data get_Meta_data() {       
	return Meta_data;
	}
}