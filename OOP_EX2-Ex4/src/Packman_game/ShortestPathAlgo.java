package Packman_game;

import java.util.ArrayList;
import java.util.Iterator;

import Coords.MyCoords;

public class ShortestPathAlgo {
	private game game;
	
	public ShortestPathAlgo(game game)
	{
		this.game = game;
	}
	
	public ArrayList<Integer> ShortestPath ()
	{
		
		MyCoords mycoords = new MyCoords();
		ArrayList<Integer> order = new ArrayList<Integer>();
		
		ArrayList<Packman> pacList = new ArrayList<Packman>();
		pacList.addAll(game.getPackman());         //adds all the pacman to the array list
		//ArrayList<Fruit> fruitsTemp = new ArrayList<Fruit>();
		ArrayList<fruits> fruitList = new ArrayList<fruits>();
		fruitList.addAll(game.getfruits());  
		
		Iterator<fruits> itF = fruitList.iterator();
	//	Iterator<fruits> itF = game.getFruits().iterator();
		
		while(itF.hasNext())
		{
			int index = 0;
			fruits fruit = itF.next();
			Iterator<Packman> itP = pacList.iterator();
			//taking first/only packman as fastest with best time by default
			Packman fastest = itP.next();
			double bestTime = mycoords.distance3d(fastest.getPacman(),fruit.getPoints())/fastest.getSpeed_weight();
			
			while(itP.hasNext())
			{
				Packman packman = itP.next();
				++index;
				double time = mycoords.distance3d(packman.getPacman(),fruit.getPoints())/packman.getSpeed_weight();
				if(time<bestTime)
				{
					bestTime = time;
					fastest = packman;
				}
			}
			order.add(fastest.getId());
			order.add(fruit.getId());
			//change the place of the fastest packman to the place of fruit
			pacList.set(index,new Packman(fastest.getRadius(),fastest.getSpeed_weight(),index,fruit.getPoints()));
			
		}
		return order;
		
	}
}
	