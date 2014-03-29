(ns outrun.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


;; Reaktor Fast Track Out Run problem
;; (http://reaktor.fi/careers/fast_track/)
;; Boils down to finding the longest path of the given directed
;; acyclic graph

;; Longest path problem:
;; (http://en.wikipedia.org/wiki/Longest_path_problem)

;; Linear time solution for a DAG G: Find the shortest paths of the
;; negated graph -G

;; Input format
;;       22
;;     14  81
;;   81  46  34
;; 83  59  94  9

;; TODO
;; [ ] Model the graph with Clojure data structures
;; [ ] Read the input format into a graph data structure
;; [ ] Negate the graph
;; [ ] Implement and perform  the shortest path finding
;; [ ] Display results
;; [ ] (Optional): Visualize the graph and the path
