Feature: TrainReservation

  Scenario: making a reservation under the assumption there is enough space in the train
    Given there is a counter
    And they know about a train called "ICE Grindelwald"
    And they know about a train called "Jungfraujochbahn"
    When I make a reservation for 1 persons in the train "Jungfraujochbahn"
    Then I get the following reservation receipt
    """
    Train: Jungfraujochbahn
    Carriage 1 - Seat 1
    """