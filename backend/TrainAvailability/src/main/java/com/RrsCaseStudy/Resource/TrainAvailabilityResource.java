package com.RrsCaseStudy.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RrsCaseStudy.Repository.RrsRepository;
import com.RrsCaseStudy.model.TrainAvailability;

@RestController
@RequestMapping("/train")
public class TrainAvailabilityResource {
	@Autowired
	RrsRepository repository;
	@PostMapping("/AddTrains")
	public String saveBooks(@RequestBody TrainAvailability train)
	{
		repository.save(train);
		return "Train added "+ train.getTrainNo();
	}
	@GetMapping("/ShowAllTrains")
	public List<TrainAvailability> getTrains()
	{
		return repository.findAll();
	}
	@GetMapping("/findtrainById/{trainNo}")
	public Optional<TrainAvailability> getByID(@PathVariable int trainNo)
	{
		return repository.findById(trainNo);
	}
	@GetMapping("/findtrainByDestination/{destination}")
	public List<TrainAvailability> getTrainByDestination(@PathVariable String destination)
	{
		return repository.findByDestination(destination);
	}
	@GetMapping("/findtrainBySource/{startLocation}")
	public List<TrainAvailability> getTrainByStartLocation(@PathVariable String startLocation)
	{
		return repository.findByStartLocation(startLocation);
	}
	@GetMapping("/findtrainByDate/{availableDate}")
	public List<TrainAvailability> getTrainByAvailableDate(@PathVariable Date availableDate)
	{
		return repository.findByAvailableDate(availableDate);
	}
	@PutMapping("/updateTraindetails")
	public String UpdateTrain(@RequestBody TrainAvailability train)
	{
		repository.save(train);
		return "Train updated "+ train.getTrainNo();
	}
}
