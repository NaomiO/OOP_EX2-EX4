package GIS;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class represents a project; after creating layers in GISlayer we add them to a "project"
 * @author Shalhevet && Naomi
 *
 */
public class GISproject implements GIS_project{

	private MetaDataForFile Meta_data;
	Set<GIS_layer> layer;

	public GISproject() {
		layer = new LinkedHashSet<GIS_layer>();
		Meta_data = new MetaDataForFile();
	}

	Set<GIS_layer> project= new HashSet<GIS_layer>();
	/**
	 * add layer to project
	 */
	@Override
	public boolean add(GIS_layer e) {

		boolean b = project.add(e);

		return b;
	}
	/**
	 * add all to project
	 */
	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {

		boolean b=  project.addAll(c);

		return b; 
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

		boolean b = project.contains(o);

		return b;
	}
	/**
	 * ask if the collection contains c
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		
		 boolean b = project.containsAll(c);
		 
		 return b;
	}
	/**
	 * ask if project is empty
	 */
	@Override
	public boolean isEmpty() {
		
		 boolean b = project.isEmpty();
		 
		 return b;
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
		
		 boolean b = project.remove(o);
		 
		 return b;
	}
	/**
	 * remove all c from project
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		
		  boolean b = project.removeAll(c);
		  
		  return b;
	}
	/**
	 * retain all c in project
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		
		boolean b = project.retainAll(c);
		
		return b;
	}
	/**
	 * return size of project
	 */
	@Override
	public int size() {
		
		int size = project.size();
		
		return size;
	}
	/**
	 * take the project to array
	 */
	@Override
	public Object[] toArray() {
		
		return project.toArray();
		
	}
	/**
	 * create array from project
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