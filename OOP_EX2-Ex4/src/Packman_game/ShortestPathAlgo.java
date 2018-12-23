package Packman_game;

import Geom.Point3D;
import Packman_game.game;
import Packman_game.fruits;
import Packman_game.map;
import Packman_game.Packman;



public class ShortestPathAlgo {
	
	public static class ShortestPath {

		protected fruits bestFruit;
		protected Packman bestPacman;
		protected double bestTime;
		
		public ShortestPath (fruits bestFruit, Packman bestPackman, double minTime) {
			this.bestFruit = bestFruit;
			this.bestPacman = bestPackman;
			this.bestTime = minTime;
		}
		
		
	}
	
	private static class ClosestPacman{
		private double bestTime;
		private Packman bestPackman;
		
		public ClosestPacman(double bestTime, Packman bestPackman) {
			this.bestTime = bestTime;
			this.bestPackman = bestPackman;
		}

		
	}
	
	public static ShortestPath shortest(map map, game game) {
		double bestTime = 100000000;
		fruits bestFruit = null;
		Packman bestPacman = null;

		for (fruits fruit : game.getfruits()) {  //run on the fruit array list
			ClosestPacman pman = findClosestPacman(fruit, map, game);
			double time = pman.bestTime;
			Packman packman = pman.bestPackman;
			if (time < bestTime) {
				bestFruit = fruit;
				bestPacman = packman;
				bestTime = time;
			}
			if (bestTime == 0) {
				break;
			}
		}
		
		return new ShortestPath(bestFruit, bestPacman, bestTime);
	}
	
	private static ClosestPacman findClosestPacman(fruits fruit, map map, game game) {
		
		Point3D fruitPoint = fruit.getfruit_Points();
		fruitPoint = map.GPStoPixels(fruitPoint);
		double bestTime =100000000;
		Packman bestPackman = null;
		for (Packman packman : game.getPackman()) {
			Point3D packmanPoint = packman.getPacman_Points();
			packmanPoint = map.GPStoPixels(packmanPoint);
			double time = (map.distancePixels(fruitPoint, packmanPoint) - packman.getRadius()) / packman.getSpeed_weight();
			if (time < bestTime) {
				bestPackman = packman;
				bestTime = time;
			}
		}
		return new ClosestPacman(bestTime, bestPackman);
	}

}