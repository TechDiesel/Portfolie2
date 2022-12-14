
public class App {
    
    public static void main(String[] args) {

        AdjGraph adjgraph = new AdjGraph(); // man behøver ikke at parse noget til denne, altså vi behøves ikke at
                                            // angave hvor mange Vertixes der er her
        Vertex Jaw = new Vertex("Jawaharlal Nehru");
        adjgraph.addVertex(Jaw);

        Vertex Tan = new Vertex("Tanjung Pelepas");
        adjgraph.addVertex(Tan);

        Vertex Dar = new Vertex("Dar Es Salaam");
        adjgraph.addVertex(Dar);

        Vertex Mom = new Vertex("Mombasa");
        adjgraph.addVertex(Mom);

        Vertex Zan = new Vertex("Zanzibar");
        adjgraph.addVertex(Zan);

        Vertex Jeb = new Vertex("Jebel Ali Dubai");
        adjgraph.addVertex(Jeb);

        Vertex Sal = new Vertex("Salalah");
        adjgraph.addVertex(Sal);

        adjgraph.newEdge(Jaw, Dar, 2000);
        adjgraph.newEdge(Jaw, Mom, 2000);
        adjgraph.newEdge(Tan, Dar, 3000);
        adjgraph.newEdge(Tan, Mom, 5000);
        adjgraph.newEdge(Tan, Zan, 2000);
        adjgraph.newEdge(Tan, Sal, 7000);
        adjgraph.newEdge(Tan, Jeb, 7000);
        adjgraph.newEdge(Dar, Jeb, 2000);
        adjgraph.newEdge(Dar, Jaw, 3000);
        adjgraph.newEdge(Dar, Tan, 5000);
        adjgraph.newEdge(Mom, Jeb, 500);
        adjgraph.newEdge(Mom, Sal, 2000);

        adjgraph.calcTEUStock(); // Calculates the amount of stock for all ports
        adjgraph.printTEU(); // Prints a list of all ports, and their initial amount of stock
        adjgraph.reversingFlowCost(); // calculates and prints the cost of reversing the flow
        adjgraph.cheapestFlow(); // calculates and prints the price of the flow, using the minimum cashflow
                                 // approach.

    }
}
