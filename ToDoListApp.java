package miniproject;
import java.util.*;


	
	

	class Task {
	    String description;
	    int priority; 
	    Date deadline;
	    boolean completed;

	    public Task(String description, int priority, Date deadline) {
	        this.description = description;
	        this.priority = priority;
	        this.deadline = deadline;
	        this.completed = false;
	    }

	    
	    public String toString() {
	        return "[Priority: " + priority + "] " + description + " | Deadline: " + deadline + " | Done: " + completed;
	    }
	}

	public class ToDoListApp {
	    static ArrayList<Task> tasks = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n1. Add Task\n2. View Tasks\n3. Sort by Priority & Date\n4. Mark Task as Done\n5. Exit");
	            System.out.print("Choose: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1 -> addTask();
	                case 2 -> viewTasks();
	                case 3 -> sortTasks();
	                case 4 -> deleteCompletedTasks();
	                case 5 -> System.exit(0);
	                default -> System.out.println("Invalid choice.");
	            }
	        }
	    }

	    static void addTask() {
	        System.out.print("Enter task description: ");
	        String desc = sc.nextLine();

	        System.out.print("Enter priority (1-High, 2-Med, 3-Low): ");
	        int prio = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter deadline (dd-MM-yyyy): ");
	        String dateStr = sc.nextLine();
	        Date deadline = parseDate(dateStr);

	        tasks.add(new Task(desc, prio, deadline));
	        System.out.println("Task added.");
	    }

	    static void viewTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks.");
	        } else {
	            for (int i = 0; i < tasks.size(); i++) {
	                System.out.println((i + 1) + ". " + tasks.get(i));
	            }
	        }
	    }

	    static void sortTasks() {
	        tasks.sort(Comparator
	                .comparingInt((Task t) -> t.priority)
	                .thenComparing(t -> t.deadline));
	        System.out.println("Tasks sorted by priority and deadline.");
	    }

	    static void deleteCompletedTasks() {
	        viewTasks();
	        System.out.print("Enter task number to mark as done: ");
	        int idx = sc.nextInt() - 1;
	        if (idx >= 0 && idx < tasks.size()) {
	            tasks.get(idx).completed = true;
	            System.out.println("Task marked as done.");
	        } else {
	            System.out.println("Invalid task number.");
	        }

	        tasks.removeIf(task -> task.completed);
	    }

	    static Date parseDate(String str) {
	        try {
	            return new java.text.SimpleDateFormat("dd-MM-yyyy").parse(str);
	        } catch (Exception e) {
	            System.out.println("Invalid date. Defaulting to today.");
	            return new Date();
	        }
	    }
	}


