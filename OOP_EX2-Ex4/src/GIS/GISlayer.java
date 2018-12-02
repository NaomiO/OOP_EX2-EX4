package GIS;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class GISlayer implements GIS_layer 
{	
	Set <GIS_element> layer1 = new HashSet<GIS_element>();
	Set <GIS_layer> layer2;
	private MetaDataGroup Meta_data;

	public void Project() {
		layer2 = new LinkedHashSet<GIS_layer>();
		Meta_data = new MetaDataGroup();
	}	
	/**
	 * add element to layer
	 */
	@Override
	public boolean add(GIS_element element) {

		boolean b = layer1.add(element);
		
		return b;
	}
	@Override

	public boolean addAll(Collection<? extends GIS_element> element) {
		
		 boolean b = layer1.addAll(element);
		 
		 return b;
	}
	/**
	 * clear the layer
	 */
	@Override
	public void clear() {
		layer1.clear();
	}
	/**
	 * check if the element exist in the alyer
	 */
	@Override
	public boolean contains(Object element) {
		
		 boolean b =layer1.contains(element);
		 
		 return b;
	}
	/**
	 * check if the collection is in the layer
	 */
	@Override
	public boolean containsAll(Collection<?> element) {
		
		boolean b = layer1.containsAll(element);
		
		return b;
	}
	/**
	 * check if the layer is empty
	 */
	@Override
	public boolean isEmpty() {
		
		boolean b = layer1.isEmpty(); 
		
		return b;
	}
	/**
	 * iterator type of GIS_element
	 */
	@Override
	public Iterator<GIS_element> iterator() {
		
		Iterator<GIS_element> iter = layer1.iterator(); 
		
		return iter;
	}
	/**
	 * remove element from the layer
	 */
	@Override
	public boolean remove(Object element) {
		
	boolean b = layer1.remove(element);
		
		return b;
	}
	/**
	 * remove collection of elements from the later
	 */
	@Override
	public boolean removeAll(Collection<?> element) {
		
		boolean b = layer1.removeAll(element);
		
		return b;
	}
	/**
	 * retain collection from the layer
	 */
	@Override
	public boolean retainAll(Collection<?> element) {
		
		  boolean b = layer1.retainAll(element);
		  
		  return b;
	}
	/**
	 * return the size of the layer
	 */
	@Override
	public int size() {
		
		int size = layer1.size();
		
		return size;
	} 
	/**
	 * create array from the layer
	 */
	@Override
	public Object[] toArray() {
		
		return layer1.toArray();
		
	}
	/**
	 * create array from layer
	 */
	@Override
	public <T> T[] toArray(T[] element) {
		
		return layer1.toArray(element);
		
	}
	/**
	 * return the meta datas of the layer
	 */
	@Override
	public Meta_data get_Meta_data() { 	
		
		return Meta_data;
	}
}