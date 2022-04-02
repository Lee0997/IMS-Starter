Coverage: 60%
Jira: https://supercreativename.atlassian.net/jira/software/projects/BSE/boards/1

# Restaurant IMS

In this project, I have been given a template codebase and created an inventory management system or IMS. The back-end application allows the user to create, delete, update and read from their customers, items and orders. This allows a company to correctly manage their inventory and time constraints. Alongside this, the application will allow the user to add to orders and calculate the total cost of the items contained within an order.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

Firstly, to get your own copy, you simply need to fork the repository and perform a git clone using the SSH or HTTPS:

![image](https://user-images.githubusercontent.com/84280851/161401710-40a4b3ef-171f-496e-82e4-d89836caccbb.png)

To correctly perform a git clone, use your command line to navigate to a chosen directory and simply type "git clone <SSH/HTTPS URL> and this will then proceed to pull all of the codebase from the repo into your local system.

After receiving the system on your local computer, one only needs to actually start the application using the Eclipse IDE or any of your choice and running the file contained here: 

![image](https://user-images.githubusercontent.com/84280851/161400215-221b320d-eeef-48be-95bc-115a92a2da7d.png)

As you can see, the correct file is highlighted. Next step:

![image](https://user-images.githubusercontent.com/84280851/161400262-701b47a9-494a-4385-b661-d6a6089545b1.png)

Now, just press the circled button and you will have correctly started the application.
Refer to the bottom of your screen or wherever your command line is and follow the prompts given to use the application.


### Prerequisites/Installation

What things you need to install the software and how to install them
Follow this link https://www.eclipse.org/ide/ to reach the eclipse page and simply download the IDE according to your own needs.

After this, the user will need to download both Java and Maven. Here are both links to do so:
https://www.java.com/download/ie_manual.jsp
https://maven.apache.org/download.cgi

Now. Once the user has downloaded both Java and Maven, it is time to add them to your env and path.
As this process can be quite uncomfortable for many, I have found a video to guide you step-by-step: https://www.youtube.com/watch?v=-O4QVijnA7Y
Again, adding Maven to your path and env will be the same process but if you're unsure please use this video: https://www.youtube.com/watch?v=RfCWg5ay5B0

With this done, the user should be ready to use their new IDE to follow the deployment steps and use the program.

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

The tests in this codebase essentially aim to check that the values inserted, deleted or modified from our operations result in the correct outcome. If not, they will return as a failure and we do this to ensure the developer is aware of bad logic or broken code.

```
	@Test
	public void testCreate() {
		final String F_NAME = "barry", L_NAME = "scott";
		final Customer created = new Customer(F_NAME, L_NAME);

		Mockito.when(utils.getString()).thenReturn(F_NAME, L_NAME);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
```
In this example, we are testing to see if the customer is being created properly inside of a controller. How is it doing this? So, inside of the SQL tables we will have some columns which have to be filled with information when creating a customer. In this example it is simply a customers full name. After the creation is executed, we will use Mockito, a dependency already included in the code to check validate wheter or not the customer created returns the same values that it was passed, in this case "barry" and "scott".

```
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "Cheese", "Yellow", 2));
		assertEquals(expected, DAO.readAll());
	}
```

In the next example we are checking the Data-access-object or DAO. Whilst this one may look a bit more simple, it requires the user to have already inserted some data into the test tables in SQL. If this is done correctly, the readAll function should then be able to identify the same values that were inserted into the SQL and will pass/fail accordingly. This is done using the assertEquals method which does exactly what it says on the tin! It will check whether or not the values supplied match the values that exist and that they display correctly when used through the application.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Lee Nock** - *Project expansion* - [leenock](https://github.com/Lee0997)
* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
