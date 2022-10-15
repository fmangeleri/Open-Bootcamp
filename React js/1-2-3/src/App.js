import logo from './logo.svg';
import './App.css';
import BComponent from './componentes/B_list_components'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <BComponent></BComponent>
      </header>
    </div>
  );
}

export default App;
