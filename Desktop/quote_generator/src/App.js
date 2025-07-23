import React from 'react';
import axios from 'axios';
import './App.css';

class App extends React.Component {
  state = { 
    advice: 'Click the button below to get some wisdom!',
    loading: false 
  };

  componentDidMount() { 
    this.fetchAdvice();
  }

  fetchAdvice = async () => {
    this.setState({ loading: true });
    try {
      const response = await axios.get('https://api.adviceslip.com/advice');
      // Add a small delay for better UX
      setTimeout(() => {
        this.setState({ 
          advice: response.data.slip.advice,
          loading: false 
        });
      }, 300);
    } catch (error) {
      console.error("Error fetching advice:", error);
      this.setState({ 
        advice: "Sorry, couldn't fetch advice right now. Please try again!",
        loading: false 
      });
    }
  };

  render() {
    const { advice, loading } = this.state;
    
    return (
      <div className="App">
        <h1>Daily Wisdom</h1>
        <div className="advice-container">
          <div className={`advice-card ${loading ? 'loading' : ''}`}>
            <p className="advice-text">
              {loading ? 'Getting some wisdom for you' : advice}
            </p>
          </div>
          <button 
            className="advice-button" 
            onClick={this.fetchAdvice}
            disabled={loading}
          >
            {loading ? 'Loading...' : 'Get New Advice'}
          </button>
        </div>
      </div>
    );
  }
}

export default App;
