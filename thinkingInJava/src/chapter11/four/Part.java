package chapter11.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 
 * @author admin
 *
 */
class Part {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();
	static{
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
	}
	private static Random rand=new Random(47);
	public static Part createRandom() {
		int n=rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class Filter extends Part{}

class FuelFilter extends Filter{
	 public static class Factory implements chapter11.four.Factory<FuelFilter>{
		public FuelFilter create() {
			// TODO Auto-generated method stub
			return new FuelFilter();
		}
	
	 }
}
class AirFilter extends Filter{
	public static class Factory implements chapter11.four.Factory<AirFilter>{

		public AirFilter create() {
			// TODO Auto-generated method stub
			return new AirFilter();
		}
	}
}
class CabinAirFilter extends Filter{
	public static class Factory implements chapter11.four.Factory<CabinAirFilter>{
		public CabinAirFilter create() {
			// TODO Auto-generated method stub
			return new CabinAirFilter();
		}
		
	}
}
class OilFilter extends Filter{
	public static class Factory implements chapter11.four.Factory<OilFilter>{

		public OilFilter create() {
			return new OilFilter();
		}
		
	}
}

class Belt extends Part{
}

class FanBelt extends Belt{
	public static class Factory implements chapter11.four.Factory<FanBelt>{
		public FanBelt create() {
			return new FanBelt();
		}	
	}
}

class GeneratorBelt extends Belt{
	public static class Factory implements chapter11.four.Factory<GeneratorBelt>{
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}	
	}
}

class PowerSteeringBelt extends Belt{
	public static class Factory implements chapter11.four.Factory<PowerSteeringBelt>{
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}	
	}
}
