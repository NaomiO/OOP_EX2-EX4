package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class GISlayer implements GIS_layer {
	
	private ArrayList<GIS_element> GISlayer = new ArrayList<GIS_element>();
	private ArrayList<MetaData> data = new ArrayList<MetaData>();

	public GISlayer() {
		GISlayer = new ArrayList<GIS_element>();
		data = new ArrayList<MetaData>();
	}
	
	public GISlayer(Set<GIS_element> la) {
		Iterator iter = la.iterator();
		
		while (iter.hasNext()) {
			
			GIS_element e = (GIS_element) iter.next();
			this.GISlayer.add(e);
			this.data.add((MetaData) e.getData());
		}
	}

	@Override
	public boolean add(GIS_element arg0) {
		
		boolean check = GISlayer.add(arg0);
		
		return check;
	}

	@Override
	public boolean addAll(Collection<? extends GIS_element> arg0) {
		
		boolean check  = GISlayer.addAll(arg0);
		
		return check;
	}

	@Override
	public void clear() {
		
		GISlayer.clear();
		
	}

	@Override
	public boolean contains(Object arg0) {
		
		boolean contains = GISlayer.contains(arg0);
		
		return contains;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		
		boolean containsAll = GISlayer.containsAll(arg0);
		 
		return containsAll;
	}

	@Override
	public boolean isEmpty() {
		
		boolean check = GISlayer.isEmpty();
		
		return  check;
	}

	@Override
	public Iterator<GIS_element> iterator() {
		
		return GISlayer.iterator() ;
	}

	@Override
	public boolean remove(Object arg0) {
		
		boolean b = GISlayer.remove(arg0);
		
		return b;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		
		boolean check = GISlayer.removeAll(arg0);
		
		return check;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		 
		boolean check = GISlayer.retainAll(arg0);
		
		return check;
	}

	@Override
	public int size() {
		
		int size = GISlayer.size();
		
		return size;
	}

	@Override
	public Object[] toArray() {
		
		return GISlayer.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		
		return GISlayer.toArray(arg0);
	}

	@Override
	public Meta_data get_Meta_data() {
		
		return this.get_Meta_data();
	}

}
