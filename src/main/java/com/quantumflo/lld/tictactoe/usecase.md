@startuml
left to right direction
actor HumanPlayer
actor Bot
rectangle Game {
HumanPlayer -- (Start Game)
HumanPlayer -- (Make Move)
Bot -- (Make Move)
HumanPlayer -- (Register)

(Make Move) .> (Check Winner) : includes
}

@enduml